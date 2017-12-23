# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A multi-roslaunch (for single and multi-master systems)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native rocon-console rocon-python-utils rosbash roslaunch rospy"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_launch/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54e702dfdfbc8bcac901414c5fed2ac5"
SRC_URI[sha256sum] = "f701d7e55980b2995cc26c417de11bd41f465eafdfd4a434e92756b1b99933ff"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_launch-0.3.2-1"

inherit catkin
