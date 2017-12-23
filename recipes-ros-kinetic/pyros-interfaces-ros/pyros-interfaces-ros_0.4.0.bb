# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Dynamic ROS interface for Pyros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip message-generation message-runtime pyros-common pyros-utils roslint rospy std-msgs"
SRC_URI = "https://github.com/asmodehn/pyros-rosinterface-rosrelease/archive/release/kinetic/pyros_interfaces_ros/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad3147283e7f06316b6b06d41fc82269"
SRC_URI[sha256sum] = "d26cadb449c5d95620f7606cb787164a571da22f4cdbfa8feca8068b69c36eb6"
S = "${WORKDIR}/pyros-rosinterface-rosrelease-release-kinetic-pyros_interfaces_ros-0.4.0-0"

inherit catkin
