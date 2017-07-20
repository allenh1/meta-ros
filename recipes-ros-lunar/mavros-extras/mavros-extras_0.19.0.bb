# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra nodes and plugins for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=c4ba05a85e41aed3f3861ec78997656b"

DEPENDS = "catkin cmake-modules geometry-msgs mavros mavros-msgs roscpp sensor-msgs std-msgs tf urdf visualization-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_extras/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7523c2ce6aa89584df6e542ac083484f"
SRC_URI[sha256sum] = "914b2dde1959c4237e018fa4096267ec9695a9ddb3c0708ca44fbb1ca5e59439"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
