# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a programming framework to facilitate application development involving "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "app1 app2 app3 app-loader catkin-native gsdf-msgs micros-swarm micros-swarm-gazebo micros-swarm-stage olfati-saber-flocking opensplice-dds-broker pso ros-broker testbb testnc testrth testscdspso testvstig"
SRC_URI = "https://github.com/xuefengchang/micros_swarm_framework-release/archive/release/kinetic/micros_swarm_framework/0.0.17-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "33497cd269771ccdaa220f0f8e2658da"
SRC_URI[sha256sum] = "6b74dc5baa96989a8b84b9fb28e0faab17744fe9bbeb949b975a4c7b0eb17d87"
S = "${WORKDIR}/micros_swarm_framework-release-release-kinetic-micros_swarm_framework-0.0.17-2"

inherit catkin
