# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-cairo python-imaging rosbag roslib rospy rqt-bag rqt-gui rqt-gui-py rqt-plot sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/kinetic/rqt_bag_plugins/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f14f6b58bf7a8d7ebebfb6f6ef0efb05"
SRC_URI[sha256sum] = "c1763a4256f110175c0ea6cb5ab582a797403a8a996f186cab714e8d85f9d0a8"
S = "${WORKDIR}/rqt_bag-release-release-kinetic-rqt_bag_plugins-0.4.11-0"

inherit catkin
