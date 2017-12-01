# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description of the robot kinematics and dynamics, 3D models of robot compon"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pr2-dashboard-aggregator pr2-description pr2-machine pr2-msgs"
SRC_URI = "https://github.com/ros-gbp/pr2_common-release/archive/release/lunar/pr2_common/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bcac66a1d10ae8a4100e042b6bd35610"
SRC_URI[sha256sum] = "3ff1e8d77bb023e0625674f9b1b161809bb4a3b4f862d75a584f684ff95047a6"
S = "${WORKDIR}/pr2_common-release-release-lunar-pr2_common-1.12.0-0"

inherit catkin
