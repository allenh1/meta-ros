# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS control_msgs messages.      It allows you to use"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native control-msgs rtt-actionlib-msgs rtt-geometry-msgs rtt-roscomm rtt-std-msgs rtt-trajectory-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_control-release/archive/release/kinetic/rtt_control_msgs/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "303832ef9caa6b90224d94ccd5a520b3"
SRC_URI[sha256sum] = "cd2f09bc9d79b8a1794833d1b3d57e22a0f65b35a04d3153fa06c79dbf32ec02"
S = "${WORKDIR}/rtt_ros_control-release-release-kinetic-rtt_control_msgs-0.1.1-0"

inherit catkin
