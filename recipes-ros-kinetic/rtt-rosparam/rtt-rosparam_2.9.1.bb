# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an RTT service and service-requester for associating RTT c"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen roscpp rtt-ros"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_rosparam/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "80e53f339d7c114dc6bddfba482b14c6"
SRC_URI[sha256sum] = "7727b0f85c88c28f9cd48e0843223afbdaf24ed9dbffe22016a155f1618573c2"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_rosparam-2.9.1-0"

inherit catkin
