# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS rosgraph_msgs messages.      It allows you to us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosgraph-msgs rtt-roscomm rtt-std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_rosgraph_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "797bbf28fac18427af64c3c8e93b686c"
SRC_URI[sha256sum] = "5b3d9d4447f9b64818d07b55e31a37dc8104d8cfda4242822de88a76a4676c50"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_rosgraph_msgs-2.9.1-0"

inherit catkin
