# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The robot_setup_tf_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/robot_setup_tf_tutorial/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "25d8a769e28bcf56d42af55404f28403"
SRC_URI[sha256sum] = "5e8bce1de150bf3b0330c2fc4637d9a216d2622419ca64a417f1c21197330303"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-robot_setup_tf_tutorial-0.2.3-0"

inherit catkin
