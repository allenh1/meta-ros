# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lisp client library for ROS, the Robot Operating System."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rosgraph-msgs roslang rospack sbcl std-srvs"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.9.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a385512aa6523cda169524b28b10f3be"
SRC_URI[sha256sum] = "be8e2166d143607ddd870f74793668f22053a40575878a571a3f897bddd50bba"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.9.21-0"

inherit catkin
