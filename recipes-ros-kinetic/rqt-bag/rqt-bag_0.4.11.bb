# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rosbag rosgraph-msgs roslib rosnode rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/kinetic/rqt_bag/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a15cc754ad53cddb926df195654d450a"
SRC_URI[sha256sum] = "bfd3a69f3a4f6ef4e613405e9d92c88ae0384b8cc6a44a0eee04c55e9a9c0b01"
S = "${WORKDIR}/rqt_bag-release-release-kinetic-rqt_bag-0.4.11-0"

inherit catkin
