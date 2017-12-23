# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS geometry_msgs messages.      It allows you to us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs rtt-roscomm rtt-std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_geometry_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "777164b0cac5384bb2b04bf817e10f8e"
SRC_URI[sha256sum] = "b0616d896086de891b683784413868d4700f5ed18cff2a56f82c93c15bb173c6"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_geometry_msgs-2.9.1-0"

inherit catkin
