# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for defining robot trajectories. These messages ar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime rosbag-migration-rule std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/trajectory_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d69487ef77bfeb2ba8a77cfad9f8724a"
SRC_URI[sha256sum] = "c74d34ca19beabfb781de82c0c89643a59a2bc7561a31d57067e6184d624ea24"
S = "${WORKDIR}/common_msgs-release-release-lunar-trajectory_msgs-1.12.5-0"

inherit catkin
