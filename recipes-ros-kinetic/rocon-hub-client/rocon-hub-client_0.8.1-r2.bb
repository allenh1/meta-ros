# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Client api for discovery and connection to rocon hubs. It also has     a few con"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gateway-msgs rocon-gateway-utils rocon-python-redis rospy"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_hub_client/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b374f17a12cf867d7690bb7cfa96854"
SRC_URI[sha256sum] = "9bc3f700681d29505b1755939d9d7a75c81052e6c5748b0d599267917148267c"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_hub_client-0.8.1-2"

inherit catkin
