# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description of the robot kinematics and dynamics, 3D models of robot compon"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin pr2_dashboard_aggregator pr2_description pr2_machine pr2_msgs"
SRC_URI = "https://github.com/ros-gbp/pr2_common-release/archive/release/lunar/pr2_common/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bcac66a1d10ae8a4100e042b6bd35610"
SRC_URI[sha256sum] = "3ff1e8d77bb023e0625674f9b1b161809bb4a3b4f862d75a584f684ff95047a6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
