# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wraps the ViSP moving edge tracker provided by the ViSP visual     servoing libr"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs image-proc image-transport message-generation message-runtime nodelet resource-retriever roscpp rospy sensor-msgs std-msgs tf visp"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_tracker/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b56f1a566d94b6bfaff316ff79273e9d"
SRC_URI[sha256sum] = "285e621f809790c21ad09f7ac72a10ae0054825e2cac22348bda8577d04dbf00"
S = "${WORKDIR}/vision_visp-release-release-lunar-visp_tracker-0.10.0-1"

inherit catkin
