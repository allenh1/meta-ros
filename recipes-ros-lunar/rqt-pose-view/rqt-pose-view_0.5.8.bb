# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_pose_view provides a GUI plugin for visualizing 3D poses."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs gl-dependency python-opengl python-rospkg python-qt-binding rospy rostopic rqt-gui rqt-gui-py rqt-py-common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_pose_view-release/archive/release/lunar/rqt_pose_view/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "63cd09d2cdfc608a7755136b5ecdcb60"
SRC_URI[sha256sum] = "f51caf04795d572c5c833e37ed8cff9f3a0b45221dcfd94cac6ff5c878acd9cb"
S = "${WORKDIR}/rqt_pose_view-release-release-lunar-rqt_pose_view-0.5.8-0"

inherit catkin
