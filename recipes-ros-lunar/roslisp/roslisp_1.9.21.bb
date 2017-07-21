# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lisp client library for ROS, the Robot Operating System."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rosgraph-msgs roslang rospack sbcl std-srvs"
SRC_URI = "https://github.com/ros-gbp/roslisp-release/archive/release/lunar/roslisp/1.9.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a385512aa6523cda169524b28b10f3be"
SRC_URI[sha256sum] = "be8e2166d143607ddd870f74793668f22053a40575878a571a3f897bddd50bba"
S = "${WORKDIR}/roslisp-release-release-lunar-roslisp-1.9.21-0"

inherit catkin
