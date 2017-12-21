# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nmea_msgs package contains messages related to data in the NMEA format."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/nmea_msgs-release/archive/release/lunar/nmea_msgs/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a44062da513bdb81ceec83bc8809753"
SRC_URI[sha256sum] = "6c10c3e6c23c5bd26135891954764ad763aa47fdab06c94c240dcc737d4d2489"
S = "${WORKDIR}/nmea_msgs-release-release-lunar-nmea_msgs-1.1.0-0"

inherit catkin
