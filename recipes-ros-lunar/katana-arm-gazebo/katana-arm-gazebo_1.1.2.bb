# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package starts a Neuronics Katana robot arm in the Gazebo simulation enviro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib catkin-native controller-manager controller-manager-msgs gazebo-ros joint-trajectory-controller katana-description katana-gazebo-plugins robot-state-publisher roscpp std-msgs urdf xacro"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_arm_gazebo/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab49264d04b4b1e512b6f72f5539cfd3"
SRC_URI[sha256sum] = "5dd72fdc44c07639929611f227bc8b9b6096d168b03eac63acb7f085ca46830f"
S = "${WORKDIR}/katana_driver-release-release-lunar-katana_arm_gazebo-1.1.2-0"

inherit catkin
