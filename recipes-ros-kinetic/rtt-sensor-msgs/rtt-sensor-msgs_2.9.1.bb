# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS sensor_msgs messages.      It allows you to use "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-geometry-msgs rtt-roscomm rtt-std-msgs sensor-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_sensor_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b88295ac5531950d73116264afd17221"
SRC_URI[sha256sum] = "5d6cd8214dc084d78619073a76e6cefa91cd78294fb95e6cabb2aea5e97a43d5"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_sensor_msgs-2.9.1-0"

inherit catkin
