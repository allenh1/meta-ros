# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nmea_msgs package contains messages related to data in the NMEA format."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/nmea_msgs-release/archive/release/kinetic/nmea_msgs/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b62cf7c1dd3ceacfca185b8354ea1546"
SRC_URI[sha256sum] = "c4309447901276e86de75e5fb216fc2d9e430fb81df83fed51ec14f42e5ba862"
S = "${WORKDIR}/nmea_msgs-release-release-kinetic-nmea_msgs-1.1.0-0"

inherit catkin
