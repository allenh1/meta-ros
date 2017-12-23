# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple P-Controller for a holonomic robot base"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native geometry-msgs move-base-msgs roscpp roslib sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/code-iai-release/nav_pcontroller-release/archive/release/kinetic/nav_pcontroller/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ed884fa2418d5b782be3f06e94a23a1"
SRC_URI[sha256sum] = "f07a4ac45bda0e3059d990500c8004f69915d9db360cd19c241b27910a06f723"
S = "${WORKDIR}/nav_pcontroller-release-release-kinetic-nav_pcontroller-0.1.4-0"

inherit catkin
