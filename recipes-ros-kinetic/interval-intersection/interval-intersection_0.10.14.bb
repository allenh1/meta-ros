# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools for calculating the intersection of interval messages coming     in on sev"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs boost calibration-msgs catkin-native geometry-msgs rosconsole roscpp roscpp-serialization rostime std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/interval_intersection/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4948baace5f5a29d8300c00baa8af1fc"
SRC_URI[sha256sum] = "1f6b8720392d6300d2980977a8cef0aa50dc837cc346ec56c117829fa98ba2fb"
S = "${WORKDIR}/calibration-release-release-kinetic-interval_intersection-0.10.14-0"

inherit catkin
