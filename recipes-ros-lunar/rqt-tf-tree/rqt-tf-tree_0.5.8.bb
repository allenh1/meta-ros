# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_tf_tree provides a GUI plugin for visualizing the ROS TF frame tree."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-rospkg python-qt-binding qt-dotgraph rospy rqt-graph rqt-gui rqt-gui-py tf2 tf2-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/rqt_tf_tree-release/archive/release/lunar/rqt_tf_tree/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e57a073484c84fad92c0c74416f1d10"
SRC_URI[sha256sum] = "e89829caa836cd7426d696ae8a178441faa1cf66fc0918448fd1b399437a2394"
S = "${WORKDIR}/rqt_tf_tree-release-release-lunar-rqt_tf_tree-0.5.8-0"

inherit catkin
