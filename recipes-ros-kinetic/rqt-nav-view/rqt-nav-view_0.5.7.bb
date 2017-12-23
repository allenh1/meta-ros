# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_nav_view provides a gui for viewing navigation maps and paths."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nav-msgs python-qt-binding qt-gui rospy rqt-gui rqt-gui-py rqt-py-common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_nav_view-release/archive/release/kinetic/rqt_nav_view/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d73a6e3869998288c02bf01aa5ad371e"
SRC_URI[sha256sum] = "437a0acd3687c86f33e5f3bcfe50b125d3392b8bf913fbc9d7871f4324a58a53"
S = "${WORKDIR}/rqt_nav_view-release-release-kinetic-rqt_nav_view-0.5.7-0"

inherit catkin
