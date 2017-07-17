# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra nodes and plugins for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3LGPLv3BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a09739c4ca3d9fff5ee5f7b58862f6ae"

DEPENDS = "catkin cmake_modules geometry_msgs mavros mavros_msgs roscpp sensor_msgs std_msgs tf urdf visualization_msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_extras/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7523c2ce6aa89584df6e542ac083484f"
SRC_URI[sha256sum] = "914b2dde1959c4237e018fa4096267ec9695a9ddb3c0708ca44fbb1ca5e59439"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
