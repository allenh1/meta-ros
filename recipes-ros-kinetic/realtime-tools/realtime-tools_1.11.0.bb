# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains a set of tools that can be used from a hard     realtime thread, withou"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rospy"
SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/kinetic/realtime_tools/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b659283a94f1e1bf14660414fba56fd"
SRC_URI[sha256sum] = "d64f114e7661730df262e89c20f52f299a35ae0856cc6eaff1e147bae277e0ab"
S = "${WORKDIR}/realtime_tools-release-release-kinetic-realtime_tools-1.11.0-0"

inherit catkin
