# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A multiplexer for command velocity inputs. Arbitrates incoming cmd_vel messages "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs nodelet pluginlib roscpp yaml-cpp"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_cmd_vel_mux/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "702f8a965731e477ddd58fa12741a787"
SRC_URI[sha256sum] = "ff197e158bd6a94b4991ccf8d2ae752e41c050dbb13792ac13ade322965a35fa"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_cmd_vel_mux-0.8.2-0"

inherit catkin
