# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_tf_tree provides a GUI plugin for visualizing the ROS TF frame tree."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-rospkg python-qt-binding qt-dotgraph rospy rqt-graph rqt-gui rqt-gui-py tf2 tf2-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/rqt_tf_tree-release/archive/release/kinetic/rqt_tf_tree/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "525e3954e1495214707411fa6bd6de60"
SRC_URI[sha256sum] = "1cf9169781d33f28e1d7e1a76764446813b6dffc772ff20c3645a2f9897dc491"
S = "${WORKDIR}/rqt_tf_tree-release-release-kinetic-rqt_tf_tree-0.5.8-0"

inherit catkin
