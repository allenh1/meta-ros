# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Code for the Kobuki controller tutorial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-msgs nodelet pluginlib roscpp std-msgs yocs-controllers"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_controller_tutorial/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46bbb3654a91adef70522ed7a555f47c"
SRC_URI[sha256sum] = "6997c24a3584537e785000cbed22cd5abac69261562e10e36a08e4f572e4c20e"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_controller_tutorial-0.7.4-0"

inherit catkin
