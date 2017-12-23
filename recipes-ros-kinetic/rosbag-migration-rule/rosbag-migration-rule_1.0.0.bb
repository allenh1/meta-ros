# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This empty package allows to export rosbag migration rule files without dependin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/rosbag_migration_rule-release/archive/release/kinetic/rosbag_migration_rule/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb0adbcbb9462eab2755bb580a7d8528"
SRC_URI[sha256sum] = "8eed61c003fb4cf8aa30266e234f6a14e8fdff5f5ced9694e21c51d200507dda"
S = "${WORKDIR}/rosbag_migration_rule-release-release-kinetic-rosbag_migration_rule-1.0.0-0"

inherit catkin
