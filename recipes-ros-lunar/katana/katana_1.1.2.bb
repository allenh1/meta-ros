# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides ROS interfaces to the Neuronics Katana 450 arm.
    It wra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=70a3a2622a2b7081fb60cc0fb9c8189d"

DEPENDS = "actionlib armadillo catkin control_msgs geometry_msgs katana_msgs kni moveit_msgs roscpp roslib sensor_msgs std_srvs tf trajectory_msgs urdf"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "27e86b8071e700655ad61a1ee0709b86"
SRC_URI[sha256sum] = "dea80c6a08604ad538fca5226a3e083d0b68542199affcb586a2dd43f113f389"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
