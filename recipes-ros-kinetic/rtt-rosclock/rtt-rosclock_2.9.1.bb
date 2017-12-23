# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an RTT plugin to access different time measurements on a r"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules libxml2 ocl roscpp rospack rostime rtt rtt-rosgraph-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_rosclock/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d89ae5632549fcbeac7415373dd5bc88"
SRC_URI[sha256sum] = "7117194cb738361b859651998760d0082990f0b2b2b045633da239c42b2f4178"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_rosclock-2.9.1-0"

inherit catkin
