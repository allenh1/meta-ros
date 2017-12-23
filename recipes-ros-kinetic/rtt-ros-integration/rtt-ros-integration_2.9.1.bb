# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack contains all software necessary to build systems using both Orocos an"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1 & BSD & LGPL-2 & GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native rtt-actionlib rtt-dynamic-reconfigure rtt-ros rtt-ros-msgs rtt-rosclock rtt-roscomm rtt-rosdeployment rtt-rosnode rtt-rospack rtt-rosparam rtt-tf"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_ros_integration/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d351b068fba8d24e1da8055383b1f5c2"
SRC_URI[sha256sum] = "c656886d1a0d4cc9521c7f8fa691f90f514e3c8b4f77e27f9971e61b425b780c"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_ros_integration-2.9.1-0"

inherit catkin
