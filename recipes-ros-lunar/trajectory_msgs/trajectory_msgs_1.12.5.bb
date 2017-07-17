# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for defining robot trajectories. These messages ar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=88776adf2a7c21629e20b1b955d7d901"

DEPENDS = "catkin geometry_msgs message_generation message_runtime rosbag_migration_rule std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/trajectory_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d69487ef77bfeb2ba8a77cfad9f8724a"
SRC_URI[sha256sum] = "c74d34ca19beabfb781de82c0c89643a59a2bc7561a31d57067e6184d624ea24"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
