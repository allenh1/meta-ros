# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The robot_upstart package provides scripts which may be used to install     and "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native daemontools roslaunch xacro"
SRC_URI = "https://github.com/clearpath-gbp/robot_upstart-release/archive/release/kinetic/robot_upstart/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f48dc77d108eee4898da8fef6dc6f610"
SRC_URI[sha256sum] = "42db3c69737ceaeec05ba10e4d2a318cbd16138da1d0094ac0b0d9867438587a"
S = "${WORKDIR}/robot_upstart-release-release-kinetic-robot_upstart-0.2.2-0"

inherit catkin
