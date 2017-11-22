# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple P-Controller for a holonomic robot base"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin geometry-msgs move-base-msgs roscpp roslib sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/code-iai-release/nav_pcontroller-release/archive/release/lunar/nav_pcontroller/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a4ce84eeb2cbc2e82673cbc080585a9e"
SRC_URI[sha256sum] = "5f78cd0dd13731aab9886e578ad0cccd71b24b2f3a93f1467b73bc31a58a6141"
S = "${WORKDIR}/nav_pcontroller-release-release-lunar-nav_pcontroller-0.1.4-0"

inherit catkin
