# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate the packages required to use publish / subscribe, ser"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules common-msgs gencpp geneus genlisp genmsg gennodejs genpy message-generation message-runtime ros ros-comm rosbag-migration-rule rosconsole-bridge roscpp-core rosgraph-msgs roslisp rospack std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/ros_core/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3542293af502d433070f6ccdd42e707c"
SRC_URI[sha256sum] = "9a4b3d516bb5e2fe6d76cd97eb19414175c90ff2d602a846e2661ebedfaa2da1"
S = "${WORKDIR}/metapackages-release-release-kinetic-ros_core-1.3.1-0"

inherit catkin
