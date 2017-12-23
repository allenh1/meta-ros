# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_dep provides a GUI plugin for visualizing the ROS dependency graph."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-dotgraph qt-gui qt-gui-py-common rqt-graph rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_dep-release/archive/release/kinetic/rqt_dep/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "954d8c5ee88e68d6c0ed6d947f90c425"
SRC_URI[sha256sum] = "429a10cabbf859bcc0463e80196b706e7736dfeb9e4472fd32bd87fea3d45d94"
S = "${WORKDIR}/rqt_dep-release-release-kinetic-rqt_dep-0.4.8-0"

inherit catkin
