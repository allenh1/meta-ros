# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-core moveit-ros-planning pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_fake_controller_manager/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cff6829069116e4f3aba8e0a77daec30"
SRC_URI[sha256sum] = "5ff6a992d450567d1424e2c2589ee245f88334ae779f42851b902684c154e078"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_fake_controller_manager-0.9.8-0"

inherit catkin
