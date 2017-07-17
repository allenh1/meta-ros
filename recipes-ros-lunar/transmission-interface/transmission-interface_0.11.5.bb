# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Transmission Interface."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Modified BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=129fdeb38464449b78c8fb022f356747"

DEPENDS = "catkin cmake_modules hardware_interface pluginlib roscpp tinyxml"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/transmission_interface/0.11.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d706412aad487c462df51fa0a3fcaa21"
SRC_URI[sha256sum] = "fff9c41c6be500e311a10dc4722afd0be0f0408d8ae60b1f6b0cc1dbb4f0f10b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
