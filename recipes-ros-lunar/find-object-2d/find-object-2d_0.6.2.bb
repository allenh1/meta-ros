# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The find_object_2d package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cv-bridge genmsg image-transport message-filters qt-gui-cpp roscpp rospy sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/introlab/find_object_2d-release/archive/release/lunar/find_object_2d/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2f251dba532f05de97f6950d37fcc16"
SRC_URI[sha256sum] = "7ccdfb50ab97b54e303590a3a84e913d35e0378b4b0fb5c6f1d9186032a16239"
S = "${WORKDIR}/find_object_2d-release-release-lunar-find_object_2d-0.6.2-0"

inherit catkin
