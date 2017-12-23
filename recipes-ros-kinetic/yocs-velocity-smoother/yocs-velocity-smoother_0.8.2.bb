# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bound incoming velocity messages according to robot velocity and acceleration li"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure ecl-threads geometry-msgs nav-msgs nodelet pluginlib roscpp"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_velocity_smoother/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "377120dde035257b1cc8b52053de43e4"
SRC_URI[sha256sum] = "301ea3851f8e6b544e903177b47025430d8345efde31afbd883754e4c0763b83"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_velocity_smoother-0.8.2-0"

inherit catkin
