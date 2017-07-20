# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS python API step-by-step,     i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message_generation message_runtime rospy rostest std_msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/rospy_tutorials/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e9918dde561cecec78e117a1f3f2c89"
SRC_URI[sha256sum] = "03e2ce137e0f5aabf72886cbbd38bc4718a9d74951911295070e9a21b35ab81a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
