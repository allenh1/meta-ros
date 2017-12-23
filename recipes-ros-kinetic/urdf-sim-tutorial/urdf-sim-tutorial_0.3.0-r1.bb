# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The urdf_sim_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diff-drive-controller gazebo-ros gazebo-ros-control joint-state-controller position-controllers robot-state-publisher rqt-robot-steering rviz urdf-tutorial xacro"
SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/kinetic/urdf_sim_tutorial/0.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "581d8e84fe85597460607eead03d740d"
SRC_URI[sha256sum] = "edae179c71dd174dfd50f7a85af4e9bfec70c106e1d9b47d73a063d24891a590"
S = "${WORKDIR}/urdf_tutorial-release-release-kinetic-urdf_sim_tutorial-0.3.0-1"

inherit catkin
