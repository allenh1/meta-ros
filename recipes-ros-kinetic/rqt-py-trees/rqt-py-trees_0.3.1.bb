# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_trees provides a GUI plugin for visualizing py_trees behaviour trees base"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native geometry-msgs py-trees py-trees-msgs python-pygraphviz python-rospkg python-termcolor qt-dotgraph rospy rqt-bag rqt-graph rqt-gui rqt-gui-py unique-id"
SRC_URI = "https://github.com/stonier/rqt_py_trees-release/archive/release/kinetic/rqt_py_trees/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23e7d4156cc9b6d84d71a08925219aaf"
SRC_URI[sha256sum] = "ca85b85d9e28d0276387e15c30811b0eb974f06bafb6290ed6db74c9f79825bb"
S = "${WORKDIR}/rqt_py_trees-release-release-kinetic-rqt_py_trees-0.3.1-0"

inherit catkin
