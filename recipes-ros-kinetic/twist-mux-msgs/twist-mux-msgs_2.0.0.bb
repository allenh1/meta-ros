# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The twist_mux msgs and actions package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=6bc0e2b80b41b84c8240cea714dea709"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/twist_mux_msgs-release/archive/release/kinetic/twist_mux_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13e1fd128229646e43d02b1675fb1939"
SRC_URI[sha256sum] = "275201171d8058f8d488163fe05611cc2b1d44400ed1d152ccba227a688f3f70"
S = "${WORKDIR}/twist_mux_msgs-release-release-kinetic-twist_mux_msgs-2.0.0-0"

inherit catkin
