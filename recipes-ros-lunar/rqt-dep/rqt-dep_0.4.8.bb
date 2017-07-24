# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_dep provides a GUI plugin for visualizing the ROS dependency graph."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg python-qt-binding qt-dotgraph qt-gui qt-gui-py-common rqt-graph rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_dep-release/archive/release/lunar/rqt_dep/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5b84293722c69c28c52983baf83968f"
SRC_URI[sha256sum] = "ec3227b0dc67dac62e83da5ea4c81792aecaf421e8cece88ce59e3bac9d4da73"
S = "${WORKDIR}/rqt_dep-release-release-lunar-rqt_dep-0.4.8-0"

inherit catkin
