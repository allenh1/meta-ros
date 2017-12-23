# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS shape_msgs messages.      It allows you to use R"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-geometry-msgs rtt-roscomm rtt-std-msgs shape-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_shape_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "22f12e578797b0c3902811929acf3bd9"
SRC_URI[sha256sum] = "012869bfea0aa3c1f693337048fccc8c1d6bc5eddc3e1583f56eb438d443ef1d"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_shape_msgs-2.9.1-0"

inherit catkin
