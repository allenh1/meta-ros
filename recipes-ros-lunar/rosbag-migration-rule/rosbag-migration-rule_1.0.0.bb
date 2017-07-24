# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This empty package allows to export rosbag migration rule files without dependin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native"
SRC_URI = "https://github.com/ros-gbp/rosbag_migration_rule-release/archive/release/lunar/rosbag_migration_rule/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9f3e6242b55c2c746a990d40e278788"
SRC_URI[sha256sum] = "e8d4349799d318a8f5ec8ebe01852e06aeb31125a2d57e2c12b1e5aff926c404"
S = "${WORKDIR}/rosbag_migration_rule-release-release-lunar-rosbag_migration_rule-1.0.0-0"

inherit catkin
