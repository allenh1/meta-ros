# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate the packages required to use publish / subscribe, ser"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cmake-modules common-msgs gencpp geneus genlisp genmsg gennodejs genpy message-generation message-runtime ros ros-comm rosbag-migration-rule rosconsole-bridge roscpp-core rosgraph-msgs roslisp rospack std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/ros_core/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d1cd633d116977873f093042c2af2b8"
SRC_URI[sha256sum] = "5a7d1db4bc048216d5fb0552b3c1ed3fc33a178186e4bc6609cf61684ad7aa6d"
S = "${WORKDIR}/metapackages-release-release-lunar-ros_core-1.3.1-0"

inherit catkin
