# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rosbag rosgraph-msgs roslib rosnode rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/lunar/rqt_bag/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6054349258073641a91d538ed8e53e6"
SRC_URI[sha256sum] = "831cdda74618702ff2929858bb40b8d09e6f7aae85220ba81dc3f72169ec862b"
S = "${WORKDIR}/rqt_bag-release-release-lunar-rqt_bag-0.4.8-0"

inherit catkin
