# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Quickly load variables from rosparam with good command line error checking."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen eigen-conversions roscpp roslint"
SRC_URI = "https://github.com/davetcoleman/rosparam_shortcuts-release/archive/release/kinetic/rosparam_shortcuts/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aba05e57a7c8acba814e57ffb867b5ca"
SRC_URI[sha256sum] = "44eb8f5cd6b32e784a2360cdd96e74d1453608661eb083f3275ed4e42390dd92"
S = "${WORKDIR}/rosparam_shortcuts-release-release-kinetic-rosparam_shortcuts-0.2.1-0"

inherit catkin
